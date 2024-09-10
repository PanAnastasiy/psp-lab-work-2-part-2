package org.example;

public class FixedFurniture extends FObject
{
    protected String fMaterial;
    public FixedFurniture()
    {
        super();
        fMaterial=new String();
        generateName();
    }
    public void setMaterial(String material)
    {
        fMaterial=material;
    }
    @Override
    protected void generateName() {
        fName="Unknown_Fixed_Furniture";
    }

    @Override
    public String toString()
    {
        String str=new String();
        str=super.toString()+"_Материал:"+fMaterial;
        return str;
    }

}