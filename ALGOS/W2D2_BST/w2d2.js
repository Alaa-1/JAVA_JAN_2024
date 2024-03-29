// https://www.cs.usfca.edu/~galles/visualization/BST.html
// http://btv.melezinek.cz/binary-search-tree.html
/*           BST
          this.root
              |
             (10)
  node.left /   \ node.right
          (5)    (15)
         / \     /   \
              (12)   (20)
              /  \   /  \
*/

class BSTNode {
  constructor(val) {
    this.val = val;
    /* These properties are how this node is connected to other nodes to form
        the tree. Similar to .next in a SinglyLinkedList except a BST node can
        be connected to two other nodes. To start, new nodes will not be
        connected to any other nodes, these properties will be set after
        the new node is instantiated.*/
    this.left = null;
    this.right = null;
  }
}

class BST {
  constructor() {
    /* Just like the head of a linked list, this is the start of our tree which
        branches downward from here. */
    this.root = null;
  }

  isEmpty() {
    return this.root === null;
  }

  /* recursive insert

          the new Node(val) we want to insert
            |
            |     pass a changed current as we call the function again
            |       |
            v       v                       */
  insert(node, current = this.root) {
    // create defaults
    // if (current === undefined) {
    //     current = this.root;
    // }
    // if the tree is empty?
    // check if the node VALUE is > OR < current's .val
    // if less than...
    // check current.left is null?
    // insert
    // exit / return
    // else
    // reassign current
    // RECURSE - call the function again (passing in the new current)
    // this.insert(node, new_current)
  }
   // iterative
    getSmallestFromSubtree() {
        var runner = this.root;
        // return if root if null
        if(!runner) return;

        // loop to the left if it exists
        while(runner.left){
            runner = runner.left
        }
        // when the while ends, return runner.val
        return runner.val
    }

    // TODO
    getLargestFromSubtree(){}
}

// myBst.insert(new Node(100))

// Recursion is:
// - function that calls itself
// - and modifies the inputs
// - so that the inputs lead to a 'base case' and end the recursive call

// https://www.cs.usfca.edu/~galles/visualization/BST.html
// http://btv.melezinek.cz/binary-search-tree.html

var myBST = new BST();
console.log(myBST);
myBST.insert(new BSTNode(10));
// myBST.insert(new BSTNode(15));
// myBST.insert(new BSTNode(5));
// myBST.insert(new BSTNode(20));
// myBST.insert(new BSTNode(12));
// console.log(myBST);
/*           BST
          this.root
              |
             (10)
  node.left /   \ node.right
          (5)    (15)
         / \     /   \
              (12)   (20)
              /  \   /  \
*/


 // iterative
    getSmallestFromSubtree() {}

    getLargestFromSubtree(){}
// ------------------
