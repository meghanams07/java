class Tree {
    private String treeNames[] = new String[10];
    int index;

    public boolean addTree(String tree){
        boolean isValid = false;
        if(tree != null && !tree.isEmpty()){
            if(index < treeNames.length){
                treeNames[index] = tree;
                index++;
                isValid = true;
            } else {
                System.out.println("Tree list is full");
            }
        } else {
            System.out.println(tree + " Not Valid");
        }
        return isValid;
    }

    public void displayTrees(){
        System.out.println("\n--- Trees ---");
        for(String tree : treeNames){
            if(tree != null){
                System.out.println(tree);
            }
        }
    }

    public String getString(int index){
        String tree = null;
        if(index < treeNames.length){
            tree = treeNames[index];
            System.out.println(tree);
            index++;
        } else System.out.println("Invalid");
        return tree;
    }

    public int getIndex(String tree){
        int index = 0;
        for(String t : treeNames){
            if(t == tree){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateTree(String existingTree, String updatedTree){
        boolean isUpdated = false;
        for(int index = 0; index < treeNames.length; index++){
            if(treeNames[index] == existingTree){
                treeNames[index] = updatedTree;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Tree Not Found");
        }
        return isUpdated;
    }

    public boolean deleteTree(String tree){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < treeNames.length; index++){
            if(treeNames[index].equals(tree)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < treeNames.length - 1; j++){
                treeNames[j] = treeNames[j + 1];
            }
            treeNames[treeNames.length - 1] = null;
        }
        return isFound;
    }
}