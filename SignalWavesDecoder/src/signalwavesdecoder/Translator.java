package signalwavesdecoder;


public class Translator {
    
    Transceiver tObj;
    public void decodeSignal(int input)
    {
        switch (input) {
            case 2:
                System.out.println("Minerals Found!");
                break;
            case 3:
                System.out.println("Microorganism Found!");
                break;
            default:
                System.out.println("Water Found!");
                break;
        }
        
    }
    
}
