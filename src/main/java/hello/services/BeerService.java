package hello.services;

import hello.configuration.RestTemplateConfig;
import hello.model.BeerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * Created by Thomas Leruth on 10/26/17
 */

@Service
@ComponentScan(basePackageClasses = RestTemplateConfig.class)
public class BeerService {

    @Value("${bruwerydb.key}")
    private String bruweryKey;

    @Autowired
    RestTemplate restTemplate;

    public BeerInfo getRandomBeer(){
        BeerInfo beerInfo = restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/random?key=" + bruweryKey
                , BeerInfo.class);
        return beerInfo;
    }
}
