package ru.github.vastap;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Tests on algorightms implementations
 */
public class AppTest {

	@Test
	public void shouldDoBubbleSort() {
		int[] array = new int[]{5, 3, 4, 2, 6, 9, 7};
		App.bubbleSort(array);
		assertEquals("[2, 3, 4, 5, 6, 7, 9]", Arrays.toString(array));

		array = new int[]{5, 3, 4, 2, 6, 9, 7};
		App.bubbleSortWithXORSwap(array);
		assertEquals("[2, 3, 4, 5, 6, 7, 9]", Arrays.toString(array));
	}

	@Test
	public void shouldDoSelectionSort() {
		int[] array = new int[]{5, 3, 4, 2, 6, 9, 7};
		App.selectionSort(array);
		assertEquals("[2, 3, 4, 5, 6, 7, 9]", Arrays.toString(array));
	}

	@Test
	public void shouldDoInsertionSort() {
		int[] array = new int[]{5, 4, 3, 2, 1};
		App.insertionSort(array);
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(array));
	}

	@Test
	public void shouldDoShuttleSort() {
		int[] array = new int[]{5, 4, 3, 2, 1};
		App.shuttleSort(array);
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(array));
	}

	@Test
	public void shouldDoShellSort() {
		int[] array = new int[]{5, 4, 3, 2, 1};
		App.shellSort(array);
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(array));
	}

	@Test
	public void shouldDoQuickSort() {
		int[] array = new int[]{4, 2, 6, 1, 3};
		App.quickSort(array, 0, array.length - 1);
		assertEquals("[1, 2, 3, 4, 6]", Arrays.toString(array));

		array = new int[]{5, 3, 4, 2, 6, 9, 7};
		App.quickSort(array, 0, array.length - 1);
		assertEquals("[2, 3, 4, 5, 6, 7, 9]", Arrays.toString(array));

		array = new int[]{6, 2, 6, 1, 6};
		App.quickSort(array, 0, array.length - 1);
		assertEquals("[1, 2, 6, 6, 6]", Arrays.toString(array));

	}

	@Test
	public void shouldDoMergeSort() {
		int[] array = new int[]{8, 4, 6, 2, 1, 7, 5, 3};
		App.mergeSort(array, 0, array.length - 1);
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(array));

		array = new int[]{1, 3, 2};
		App.mergeSort(array, 0, array.length - 1);
		assertEquals("[1, 2, 3]", Arrays.toString(array));

		array = new int[]{3, 2, 3};
		App.mergeSort(array, 0, array.length - 1);
		assertEquals("[2, 3, 3]", Arrays.toString(array));

		array = new int[]{1, 3, 3};
		App.mergeSort(array, 0, array.length - 1);
		assertEquals("[1, 3, 3]", Arrays.toString(array));
	}
}
