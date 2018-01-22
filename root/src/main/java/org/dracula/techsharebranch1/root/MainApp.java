package org.dracula.techsharebranch1.root;

public class MainApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        String name = args[0];
        try {
            Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到类："+name);
            return;
        }
        System.out.println("找到类："+name);
    }

}
