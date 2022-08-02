/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_11;

import java.util.ArrayList;

/**
 *
 * @author vadimzubchenko
 */
public class Bheap {

    private ArrayList<Integer> heap;
    private int size = 0;

    public Bheap() {
        heap = new ArrayList<>();
        size = 0;
    }

    public void insert(int data) {
        heap.add(data);

        int pos = size;
        int temp;

        while (pos != 0) {

            int parent_position = (pos - 1) / 2;

            if (heap.get(pos) > heap.get(parent_position)) {

                break;
            } else {

                temp = heap.get(parent_position);
                heap.set(parent_position, heap.get(pos));
                heap.set(pos, temp);

                pos = parent_position;
            }
        }
        size++;
    }

    public void deleteMin() {

        heap.set(0, heap.get(size - 1));

        heap.remove(size - 1);

        int tmp;
        int left;
        int right;
        int position = 0;

        while (true) {
            left = 2 * position + 1;
            right = 2 * position + 2;

            if (left > size) {
                break;

            } else if (left == size || heap.get(left) < heap.get(right)) {

                tmp = heap.get(position);

                heap.set(position, heap.get(left));
                heap.set(left, tmp);
                position = left;
            } else if (heap.get(left) > heap.get(right)) {

                tmp = heap.get(position);

                heap.set(position, heap.get(right));
                heap.set(right, tmp);
                position = right;
            } else {
                break;
            }

        }

        size--;
    }

    public void print() {
        System.out.println(heap);
    }
}
