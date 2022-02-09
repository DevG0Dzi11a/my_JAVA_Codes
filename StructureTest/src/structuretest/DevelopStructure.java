
package structuretest;


public class DevelopStructure {
    
    Structure structObj = new Structure();
    
    public Structure produceStructure(double radius)
    {
        structObj.setStructureVolume(((double)4/3)*Math.PI*Math.pow(radius, 3));
        structObj.setStructureName("Sphere");
        return structObj;
                
    }
}
