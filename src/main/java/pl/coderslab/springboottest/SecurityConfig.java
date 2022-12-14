package pl.coderslab.springboottest;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**")
                .hasAnyRole("USER", "ADMIN")
                .and().formLogin().loginPage("/login")
                .and().logout().logoutSuccessUrl("/")
                .permitAll().and()
                .exceptionHandling().accessDeniedPage("/403");
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("{noop}user123").roles("USER")
                .and()
                .withUser("admin1").password("{noop}admin123").roles("ADMIN");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/about").authenticated()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .and().formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/");
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin/**").hasAnyRole("USER","ADMIN")
//                .antMatchers("/admin/**").hasAnyAuthority("ROLE_ADMIN")
//                .and().formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/");
//    }

}