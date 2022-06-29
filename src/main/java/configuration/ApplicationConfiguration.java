package configuration;

import org.example.entity.Cornemuse;
import org.example.entity.Instrument;
import org.example.entity.Musicien;
import org.example.entity.Sonneur;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean(name="cornemuse")
    public Instrument getCornemuse(){
        Instrument instrument = new Cornemuse();
        return instrument;
    }

    @Bean
    public Musicien getSonneur(){
        Musicien leSonneur = new Sonneur("Hans", this.getCornemuse());
        return leSonneur;
    }

   // @Bean
    public Musicien getSonneur2(String nom,@Qualifier("cornemuse") Instrument cornemuse){
        Musicien leSonneur = new Sonneur(nom, cornemuse);
        return leSonneur;
    }
}
