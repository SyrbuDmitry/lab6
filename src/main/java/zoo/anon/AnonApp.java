package zoo.anon;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.stream.ActorMaterializer;
import org.apache.zookeeper.ZooKeeper;

public class AnonApp {
    public static void main(String[] args ){
        ActorSystem system = ActorSystem.create("lab6");
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        ActorRef configActor = system.actorOf(Props.create(ConfigStorageActor.class));


    }
}
