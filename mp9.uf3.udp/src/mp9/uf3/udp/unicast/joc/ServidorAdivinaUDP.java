package mp9.uf3.udp.unicast.joc;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;


/** Servidor que tria un número aleatòri entre 1 i max,
 ** i el ClientAdivinaUDP.java l'ha d'encertar. La Comunicació és UDP a través del port 5556
 ** Accepta varis clients però quan un client guanya es tanca la comunicació i el client que no ha guanyat
 ** ha d'interpretar pel temps d'espera sense resposta, que ha perdut
 **
 **	Espera rebre un integer (4 bytes)
 ** La classe SecretNum és qui s'encarrega d'avaluar l'enter rebut:
 ** 0 -> encertat i partida acabada
 ** 1 -> El número pensat és més petit
 ** 2 -> El número pensar és més gran
 **cd
 **/

public class ServidorAdivinaUDP {

	


}
