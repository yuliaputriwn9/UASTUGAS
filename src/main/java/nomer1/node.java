package nomer1;
public class node {
    /*
    a) 60 merupakan predesor dari 40 dan 30
    b) 30 dan 50 merupakan succesor dari 80
    c) 60 dan 40 merupakan ancestor dari 50 atau 80
    d) 40 dan 50 merupakan descendent dari 60
    e) 40 merupakan parent dari 50
    f) 50 merupakan child dari 40
    g) 80 dan 60 adalah sibling
    h) subtree 40,30,50 dan subtree 80,60,30
    */
    char data;
    node left;
    node right;
    public node(char data){
        this.data = data;
    }
}
