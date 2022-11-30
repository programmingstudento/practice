package com.homework.java;

import java.util.List;

//TODO: complete this object/class

public class Pagination<I> {

	private List<I> collection;
	private int itemsPerPage;

	/**
	 * The constructor takes in an array of items and a integer indicating how many
	 * items fit within a single page
	 */
	public Pagination(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return collection.size();
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		return collection.size() % itemsPerPage == 0 ? collection.size() / itemsPerPage
				: collection.size() / itemsPerPage + 1;
	}

	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		int size = pageCount(), result = 0;
		boolean check = size <= pageIndex;
		if (check)
			result = -1;
		else if (pageIndex == size - 1) {
			result = itemCount() - itemsPerPage * (size - 1);
		} else
			result = itemsPerPage;
		return result;
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		int size = itemCount(), result = -2;
		boolean check = size == 0 || size < itemIndex || itemIndex < 0;
		if (check)
			result = -1;
		else
			result = itemIndex / itemsPerPage;
		return result;
	}
}