package javaapplication3;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLReadSave {

    static Player readPlayer(String filename) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Player.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Player player = (Player) unmarshaller.unmarshal(new File(filename));
        player.getPlayer();
        return player;

    }

    static void savePlayer(String filename, Player player) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Player.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        Player savedplayer = Player.getInstance();
        savedplayer = player;
        marshaller.marshal(savedplayer, new File(filename));

    }

}
