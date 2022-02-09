
package structuretest;


public class StructureTest {


    public static void main(String[] args) {
        
        DevelopStructure devStructObj = new DevelopStructure();
        
        
        Structure s1;
        
        s1 = devStructObj.produceStructure(2);
        System.out.println(s1.getStructureName()+" Area:"+s1.getStructureVolume());
    }
    
}
