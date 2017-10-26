package hello.ressources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hello.model.BeerInfo;
import hello.services.BeerService;

/**
 * Created by Thomas Leruth on 10/26/17
 */

@RestController
public class BeerRestController {

    @Autowired
    BeerService beerService;

    @RequestMapping("/beer/random")
    public BeerInfo getRandomBeer(){
        return beerService.getRandomBeer();
    }
}
