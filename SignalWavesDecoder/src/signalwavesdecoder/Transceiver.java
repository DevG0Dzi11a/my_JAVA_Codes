package signalwavesdecoder;

import myexceptions.InvalidInformationException;

public class Transceiver extends ControlCenter implements Signal {

    ControlCenter cObj;
    int flag=0;

    public Transceiver() {

    }
    public Transceiver(ControlCenter cObj) {
        this.cObj = cObj;
    }

    @Override
    public void inspectSignal(){
        for (int i = 2; i < cObj.getCode(); i++) {
            if (cObj.getCode() % i == 0) {
                flag = 1;
                break;
            }
            if(flag == 1)
            {
                System.out.println("Signal Recieved Information");
            }
            else
                throw new InvalidInformationException("Invalid Signal Received! Please Discard it.");
        }
    }

}
