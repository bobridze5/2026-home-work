package company.vk.edu.distrib.compute.bobridze5;

import company.vk.edu.distrib.compute.Dao;
import company.vk.edu.distrib.compute.KVService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BobridzeKVService implements KVService {
    private static final Logger log = LoggerFactory.getLogger(BobridzeKVService.class);

    private final Dao<byte[]> dao;
    private final int port;

    public BobridzeKVService(int port, Dao<byte[]> dao) {
        this.port = port;
        this.dao = dao;
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
