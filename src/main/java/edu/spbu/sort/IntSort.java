package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int a[]) {
    //Arrays.sort(array);
    rquicksort(a, 0, a.length - 1);
  }

  public static void swap(int[] a, int i, int j) {
    int r = a[i];
    a[i] = a[j];
    a[j] = r;
  }

  public static int partition(int[] a, int l, int r) {
    int i = l, j = r;
    int x = a[(l + r)/2];
    while (i <= j) {
      while (a[i] < x)
        i++;
      while (a[j] > x)
        j--;
      if (i <= j) {
        swap(a, i, j);
        i++;
        j--;
      }
    }
    return i;
  }

  public static void rquicksort(int[] a, int l, int r) {
    if (l < r) {
      int q = partition(a, l, r);
      rquicksort(a, l, q - 1);
      rquicksort(a, q, r);
    }
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
