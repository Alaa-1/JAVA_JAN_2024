// https://www.cs.usfca.edu/~galles/visualization/BST.html
// http://btv.melezinek.cz/binary-search-tree.html

class BSTNode {
  constructor(val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class BST {
  constructor() {
    this.root = null;
  }

  isEmpty() {
    return this.root === null;
  }

  //* Recursive
  find(val, current) {
    // defaults
    if (current === undefined) {
      current = this.root;
    }
    // base case
    // if current is null, return false up the call the stack
    if (current === null) {
      return false;
    }
    // if equal, return true
    if (current.val === val) {
      return true;
    }
    // logic
    if (current.val > val) {
      current = current.left;
    } else {
      current = current.right;
    }
    // recurse (the method calls itself)
    return this.find(val, current);
  }

  removeSmallest(current) {}

  insert(node, current) {}

  // recursive
  getLargestFromSubtree(current) {
    // if no tree, tree is root
    if (current === undefined) {
      current = this.root;
    }

    // if tree becomes null, return null
    if (current === null) {
      return null;
    }

    // if there is no further nodes, return tree
    if (current.right === null) {
      console.log(
        "getLargestFromSubtree >> return current.val ->",
        current.val
      );
      return current;
    }

    // else recurse to the right and try again
    return this.getLargestFromSubtree(current.right);
  }

  // recursive
  getSmallestFromSubtree(current) {
    // if no tree, tree is root
    if (current === undefined) {
      current = this.root;
    }

    // if tree becomes null, return null
    if (current === null) {
      return null;
    }

    // if there is no further nodes, return tree
    if (current.left === null) {
      console.log(
        "getSmallestFromSubtree >> return current.val ->",
        current.val
      );
      return current;
    }

    // else recurse to the right and try again
    return this.getSmallestFromSubtree(current.left);
  }

  // iterative
  getSmallestFromSubtreeIterative() {
    // create runner
    var runner = this.root;

    // return if root is null
    if (!runner) return;

    // loop to the left if it exists
    while (runner.left) {
      runner = runner.left;
    }
    // when the while ends, return runner.val
    return runner;
  }

  // --- HELPER METHOD for printing the BST ---
  // Logs this tree horizontally with the root on the left.
  print(node = this.root, spaceCnt = 0, spaceIncr = 10) {}

  /* alt tree
                  root
              <-- 25 -->
            /            \
          15             44 <---
        /    \         /    \
      10     22      35     70
    /   \   /  \    /  \   /  \
   4    12     24         66  90
*/
  // - does it exist?
  // AND
  // - is it the root?
  // AND
  // - does it have one child?
  // - does it have two children?
  // - does it have no children?
  // hints: - try swapping with the smallest of the right subtree or the largest of the left subtree.
  //        - you may use helper functions like this.getSmallestFromSubtree(current)
  //        - you may swap values 👈👀
  // look for largest of the left OR smallest of the right - to preserve the order of the BST
  // -- GOAL -> boil down the node to delete into a single leaf => solved!

  // findAndDelete
  // findAndDelete
  delete(val, current) {}
}

// Recursion is:
// - function that calls itself
// - and modifies the inputs
// - so that the inputs lead to a 'base case' and end the recursive call

//               root
//          <-- 50 -->
//         /          \
//       40           60 <---
//     /    \        /    \
//   20     45     55     70
var myBST = new BST();
myBST.insert(new BSTNode(50));
myBST.insert(new BSTNode(40));
myBST.insert(new BSTNode(60));
myBST.insert(new BSTNode(20));
myBST.insert(new BSTNode(45));
myBST.insert(new BSTNode(55));
myBST.insert(new BSTNode(70));

myBST.insert(new BSTNode(56));
myBST.insert(new BSTNode(61));

console.log(myBST);
myBST.print();
