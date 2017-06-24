package com.ds.tree;

import com.DS.tree.BST;
import com.spring.practice.Configurations.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by ajkumar on 6/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class TestBST {

    @Test
    public void insert(){

        BST bst = new BST();
        bst.insert(30);
        bst.insert(20);
        bst.insert(50);
        bst.insert(40);
        bst.insert(10);
        bst.insert(15);
    }

    @Test
    public void traverse(){
        BST bst = new BST();
        bst.insert(30);
        bst.insert(20);
        bst.insert(50);
        bst.insert(40);
        bst.insert(10);
        bst.insert(15);

//      bst.preorder();

        bst.inorder();

        bst.postorder();
    }

    @Test
    public void levelOrderTraversal(){
        BST bst = new BST();
        bst.insert(30);
        bst.insert(20);
        bst.insert(50);
        bst.insert(40);
        bst.insert(10);
        bst.insert(15);

        bst.levelOrderTraversal();
    }
}
