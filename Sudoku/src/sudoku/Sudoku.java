package sudoku;

import java.util.*;

public class Sudoku {
	int[][] square = new int[9][9];
	
	//Constructor that takes in a 2D array as a parameter 
	public Sudoku(int[][] s) {
		square = s;
	}
	
	
	//Checks to see if there are any of the same numbers in a column and row
	private boolean check(int x, int y) {
		int num = square[y][x];
		boolean check = true;
		for(int i = 0; i < square.length; i++) {
			if(y != i && num == square[i][x]) {
				check = false;
				break;
			}
		}
		for(int i = 0; i < square.length; i++) {
			if(x != i && num == square[y][i]) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	//Returns true if there are no repeating numbers in the same column and row
	private boolean check(int x, int y, int n) {
		int num = n;
		boolean check = true;
		for(int i = 0; i < square.length; i++) {
			if(y != i && num == square[i][x]) {
				check = false;
				break;
			}
		}
		for(int i = 0; i < square.length; i++) {
			if(x != i && num == square[y][i]) {
				check = false;
				break;
			}
		}
		return check;
	}
		
	/*
	    1 | 2 | 3       
	    ---------
	    4 | 5 | 6
	    ---------
	    7 | 8 | 9	
	*/
	//fills a square if that square is the only option
	private void fillSquare(int i) {
		if(i == 1) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 0; y < 3; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 0; y < 3; y++) {
						for(int x = 0; x < 3; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 2) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 0; y < 3; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 0; y < 3; y++) {
						for(int x = 3; x < 6; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 3) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 0; y < 3; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 0; y < 3; y++) {
						for(int x = 6; x < 9; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 4) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 3; y < 6; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 3; y < 6; y++) {
						for(int x = 0; x < 3; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 5) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 3; y < 6; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 3; y < 6; y++) {
						for(int x = 3; x < 6; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 6) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 3; y < 6; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 3; y < 6; y++) {
						for(int x = 6; x < 9; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 7) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 6; y < 9; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 6; y < 9; y++) {
						for(int x = 0; x < 3; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 8) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 6; y < 9; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 6; y < 9; y++) {
						for(int x = 3; x < 6; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		} else if(i == 9) {
			for(int n = 1; n < 10; n++) {
				int count = 0;
				for(int y = 6; y < 9; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == 0 && check(x, y, n)) {
							count += 1;
						}
					}
				}
				if(count == 1 && !repeatNum(i, n)) {
					for(int y = 6; y < 9; y++) {
						for(int x = 6; x < 9; x++) {
							if(square[y][x] == 0 && check(x, y, n)) {
								square[y][x] = n;
							}
						}
					}	
				}
			}
		}	
	}
	
	//Checks to see if there are any repeating numbers in the same square
	private boolean repeatNum(int i, int r) {
		boolean repeat = false;
		if(i == 1) {
			for(int n = 1; n < 10; n++) {
				for(int y = 0; y < 3; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 2) {
			for(int n = 1; n < 10; n++) {
				for(int y = 0; y < 3; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 3) {
			for(int n = 1; n < 10; n++) {
				for(int y = 0; y < 3; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 4) {
			for(int n = 1; n < 10; n++) {
				for(int y = 3; y < 6; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 5) {
			for(int n = 1; n < 10; n++) {
				for(int y = 3; y < 6; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 6) {
			for(int n = 1; n < 10; n++) {
				for(int y = 3; y < 6; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 7) {
			for(int n = 1; n < 10; n++) {
				for(int y = 6; y < 9; y++) {
					for(int x = 0; x < 3; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 8) {
			for(int n = 1; n < 10; n++) {
				for(int y = 6; y < 9; y++) {
					for(int x = 3; x < 6; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		} else if(i == 9) {
			for(int n = 1; n < 10; n++) {
				for(int y = 6; y < 9; y++) {
					for(int x = 6; x < 9; x++) {
						if(square[y][x] == r) {
							repeat = true;
						}
					}
				}
			}
		}
		return repeat;
	}
	
	//Solves the Sudoku puzzle
	public void solve() {
		for(int t = 0; t < 101; t++) {
			for(int i = 1; i < 10; i++) {
				fillSquare(i);
			}
		}
		
		int[][] backup = new int[9][9];
		int[][] backup1 = new int[9][9];
		
		for(int y = 0; y < square.length; y++) {
			for(int x = 0; x < square[y].length; x++) {
				int i = square[y][x];
				backup[y][x] = i;
			}
		}
		
		for(int y = 0; y < square.length; y++) {
			for(int x = 0; x < square[y].length; x++) {			
				if(square[y][x] == 0) {
					for(int i = 1; i < 10; i++) {
						if(check(x, y, i)) {
							square[y][x] = i;
							
							//////////////////////////////////////////////////////////////////////
							
							for(int r = 0; r < square.length; r++) {
								for(int c = 0; c < square[y].length; c++) {
									int n = square[r][c];
									backup1[r][c] = n;
								}
							}
							for(int yy = 0; yy < square.length; yy++) {
								for(int xx = 0; xx < square[yy].length; xx++) {			
									if(square[yy][xx] == 0) {
										for(int ii = 1; ii < 10; ii++) {
											if(check(xx, yy, ii)) {
												square[yy][xx] = ii;
												for(int t = 0; t < 101; t++) {
													for(int n = 1; n < 10; n++) {
														fillSquare(n);
													}
												}
												if(checkSolution()) {
													break;
												} else {
													for(int r = 0; r < square.length; r++) {
														for(int c = 0; c < square[y].length; c++) {
															int n = backup1[r][c];
															square[r][c] = n;
														}
													}
												}
											}
											if(!checkSolution()) {
												for(int r = 0; r < square.length; r++) {
													for(int c = 0; c < square[y].length; c++) {
														int n = backup1[r][c];
														square[r][c] = n;
													}
												}
											}
										}
										if(checkSolution()) {
											break;
										} else {
											for(int r = 0; r < square.length; r++) {
												for(int c = 0; c < square[y].length; c++) {
													int n = backup1[r][c];
													square[r][c] = n;
												}
											}
										}
									}
								}
								if(checkSolution()) {
									break;
								} else {
									for(int r = 0; r < square.length; r++) {
										for(int c = 0; c < square[y].length; c++) {
											int n = backup1[r][c];
											square[r][c] = n;
										}
									}
								}
							}
							
							//////////////////////////////////////////////////////////////////
							
							if(checkSolution()) {
								break;
							} else {
								for(int r = 0; r < square.length; r++) {
									for(int c = 0; c < square[y].length; c++) {
										int n = backup[r][c];
										square[r][c] = n;
									}
								}
							}
						}
						if(!checkSolution()) {
							for(int r = 0; r < square.length; r++) {
								for(int c = 0; c < square[y].length; c++) {
									int n = backup[r][c];
									square[r][c] = n;
								}
							}
						}
					}
					if(checkSolution()) {
						break;
					} else {
						for(int r = 0; r < square.length; r++) {
							for(int c = 0; c < square[y].length; c++) {
								int n = backup[r][c];
								square[r][c] = n;
							}
						}
					}
				}
			}
			if(checkSolution()) {
				break;
			} else {
				for(int r = 0; r < square.length; r++) {
					for(int c = 0; c < square[y].length; c++) {
						int n = backup[r][c];
						square[r][c] = n;
					}
				}
			}
		}
	}

	//Returns true if the sudoku puzzle has been solved
	public boolean checkSolution() {
		boolean solved = true;
		for(int y = 0; y < square.length; y++) {
			for(int x = 0; x < square[y].length; x++) {
				if(!check(x, y) || square[y][x] == 0) {
					solved = false;
				}
			}
		}
		return solved;
	}
	
	//Displays the Sudoku puzzle
	public void display() {
		for(int y = 0; y < square.length; y++) {
			for(int x = 0; x < square[y].length; x++) {
				if(x == 3 || x == 6) {
					System.out.print(" || ");
					System.out.print(square[y][x]);
				} else {
					System.out.printf("%3s", square[y][x]);
				}
			}
			if(y == 2 || y == 5) {
				System.out.println();
				System.out.println("  ========||=========||========");
			} else {
				System.out.println();
			}
		}
	}

	public void display(int[][] arr) {
		for(int y = 0; y < arr.length; y++) {
			for(int x = 0; x < arr[y].length; x++) {
				if(x == 3 || x == 6) {
					System.out.print(" || ");
					System.out.print(arr[y][x]);
				} else {
					System.out.printf("%3s", arr[y][x]);
				}
			}
			if(y == 2 || y == 5) {
				System.out.println();
				System.out.println("  ========||=========||========");
			} else {
				System.out.println();
			}
		}
	}
	
	public int[][] getArray(){
		return square;
	}
	
	public static void main(String[] args) {
		/*
		int[][] sudokuSquare = {
				{1,0,0,  0,0,7,  0,9,0}, 
				{0,3,0,  0,2,0,  0,0,8}, 
				{0,0,9,  6,0,0,  5,0,0},
				
				{0,0,5,  3,0,0,  9,0,0}, 
				{0,1,0,  0,8,0,  0,0,2}, 
				{6,0,0,  0,0,4,  0,0,0},
				
				{3,0,0,  0,0,0,  0,1,0}, 
				{0,4,0,  0,0,0,  0,0,7}, 
				{0,0,7,  0,0,0,  3,0,0}
				};
		
		Sudoku sudoku = new Sudoku(sudokuSquare);
		sudoku.display();
		System.out.println();
		System.out.println();
		System.out.println();
		sudoku.solve();
		sudoku.display();
		*/
	}
}


