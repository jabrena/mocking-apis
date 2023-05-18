package info.jab.ms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service
public class MyDelegateImpl implements SomethingApiDelegate {

    private static Logger logger = LoggerFactory.getLogger(MyDelegateImpl.class);

    @Override
    public ResponseEntity<Void> getSomething() {
        // implementation
        logger.info("Hello World");
        return null;
    }

}