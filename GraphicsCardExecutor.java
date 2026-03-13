class GraphicsCardExecutor {

    public static void main(String[] args) {

        GraphicsCard gc1  = new GraphicsCard("NVIDIA");
        GraphicsCard gc2  = new GraphicsCard("NVIDIA","RTX 4060");
        GraphicsCard gc3  = new GraphicsCard("NVIDIA","RTX 4060",8);
        GraphicsCard gc4  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6");
        GraphicsCard gc5  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000);
        GraphicsCard gc6  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830);
        GraphicsCard gc7  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460);
        GraphicsCard gc8  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460,"PCIe");
        GraphicsCard gc9  = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460,"PCIe",1.1);
        GraphicsCard gc10 = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460,"PCIe",1.1,true);
        GraphicsCard gc11 = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460,"PCIe",1.1,true,true);
        GraphicsCard gc12 = new GraphicsCard("NVIDIA","RTX 4060",8,"GDDR6",35000,1830,2460,"PCIe",1.1,true,true,true);

    }
}