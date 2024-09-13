package practice;

import java.util.Stack;

public class PreorderTraversalArray {
  void preorder(int[] tree) {
    if (tree == null || tree.length == 0) {
      return;
    }

    Stack<Integer> stack = new Stack<>();
    stack.push(0);  // 루트 노드 인덱스 0부터 시작

    while (!stack.isEmpty()) {
      int index = stack.pop();
      System.out.print(tree[index] + " ");

      // 오른쪽 자식부터 스택에 추가 (LIFO이므로 오른쪽을 먼저)
      int rightChild = 2 * index + 2;
      if (rightChild < tree.length) {
        stack.push(rightChild);
      }

      // 왼쪽 자식 추가
      int leftChild = 2 * index + 1;
      if (leftChild < tree.length) {
        stack.push(leftChild);
      }
    }
  }

  public static void main(String[] args) {
    PreorderTraversalArray tree = new PreorderTraversalArray();
    int[] binaryTree = {1, 2, 3, 4, 5, 6, 7};
    tree.preorder(binaryTree);
  }
}

