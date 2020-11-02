package Q1;

import java.util.ArrayList;

public class Pardes {

    private int maxTree = 100;
    private ArrayList<OrangeTree> trees;

    public Pardes(){
        trees = new ArrayList<OrangeTree>();
    }

    public void AddTree(OrangeTree Tree)
    {
        if(trees.size() < maxTree)
        {
            trees.add(Tree);
        }
        else
        {
            System.out.println("we are full");
        }
    }

    public Boolean Over400(OrangeTree Tree)
    {
        if(Tree.TotalFruitcount() >=400)
        {
            return True;
        }
        return False;
    }
}
