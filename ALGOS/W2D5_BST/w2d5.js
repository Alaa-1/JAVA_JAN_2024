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

  //* INSERT A NODE (recursive)
  insert(node, current) {
    // default current to root if no current exists
    if (current === undefined) {
      current = this.root;
    }
    if (current === null) {
      this.root = node;
      return;
    }
    if (current.val > node.val) {
      // go left
      // check if null and insert
      if (current.left === null) {
        current.left = node;
        return;
      } else {
        // otherwise recurse left
        return this.insert(node, current.left);
      }
    } else if (current.val < node.val) {
      // go right
      // check if null and insert
      if (current.right === null) {
        current.right = node;
        return;
      } else {
        // otherwise recurse left
        return this.insert(node, current.right);
      }
    }
  }

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
      return current.val;
    }

    // else recurse to the right and try again
    return this.getLargestFromSubtree(current.right);
  }

  // iterative
  getSmallestFromSubtree() {
    // create runner
    var runner = this.root;

    // return if root is null
    if (!runner) return;

    // loop to the left if it exists
    while (runner.left) {
      runner = runner.left;
    }
    // when the while ends, return runner.val
    return runner.val;
  }

  // return true or false is val exists within the current tree
  // if current is undefined, current = this.root
  find(val, current) {
    if (current === undefined) {
      current = this.root;
    }

    // base cases

    // if current is null, return false up the call stack
    if (current == null) {
      return false;
    }

    // because current is certain to be not null, check val vs val
    // if equal, return true up the call stack
    if (current.val === val) {
      return true;
    }

    // otherwise we need to recurse

    // decide on which direction
    if (current.val > val) {
      current = current.left;
    } else {
      current = current.right;
    }

    // recurse now that current is moved, return the result
    return this.find(val, current); // true / false up the call stack
  }
  removeSmallest(current = this.root) {}

  removeLargest(current = this.root) {}

  // --- HELPER METHOD for printing the BST ---
  // Logs this tree horizontally with the root on the left.
  print(node = this.root, spaceCnt = 0, spaceIncr = 10) {}
}
// Recursion is:
// - function that calls itself
// - and modifies the inputs
// - so that the inputs lead to a 'base case' and end the recursive call

// instantiate the BST class
var myBST = new BST();

// add nodes to it...
myBST.insert(new BSTNode(25));
myBST.insert(new BSTNode(15));
myBST.insert(new BSTNode(50));
myBST.insert(new BSTNode(10));
myBST.insert(new BSTNode(22));
myBST.insert(new BSTNode(35));
myBST.insert(new BSTNode(70));
myBST.insert(new BSTNode(12));
console.log(myBST);
// myBST.print();

// ...resulting in the following tree
/*
                BST
                root
             <-- 25 -->
            /          \
          15           50
        /    \       /    \
      10     22     35     70
     /  \   /  \   /  \   /  \
        12

  */

// console.log(myBST.removeSmallest());
// console.log("LARGEST ==>", myBST.removeLargest());
// console.log(myBST);
// myBST.print();  // <- uncomment this line
