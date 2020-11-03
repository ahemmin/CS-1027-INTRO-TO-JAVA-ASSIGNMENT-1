import java.util.Arrays;

/** Class that sets the parameters of the game board
 * 
 * @author Hemming
 *
 */

public class BoardGame {
		 int board_length;
		 int board_width;
		 Snake theSnake;
		 String[][] matrix;
		 
/** Constructor opens user desired board file, reads it and then stores necessary data into appropriate instance variables
 * 
 * @param boardfile User's desired board file
 */
		 
		public BoardGame(String boardfile) {
		 MyFileReader Line = new MyFileReader(boardfile);
		 Line.readInt();
		 Line.readInt();
		 this.board_length = Line.readInt();
		 this.board_width = Line.readInt();
		 matrix = new String[this.board_width][this.board_length];
		 int row = Line.readInt();
		 int col = Line.readInt();
		 theSnake = new Snake(row,col);
		 
		 for (int i = 0 ; i < this.board_width ; i++) {
			 for (int j = 0 ; j <this.board_length ; j++) {
				 matrix[i][j] = "empty";
			 }
		 }
		 while (Line.endOfFile() == false) {
		  row = Line.readInt();
		  col = Line.readInt();
		  String Object_Type = Line.readString();
		  matrix[row][col] = Object_Type;
		 }
		 for (int i = 0 ; i <this.board_width ; i++) {
			 for (int j = 0 ; j <this.board_length ; j++) {
			 }
		 }
		}
		
		
/** Method returns matrix at a specified row and column
 * 
 * @param row User's desired row coordinate
 * @param col User's desired column coordinate
 * @return String object at that position on board
 */
		
		public String getObject(int row, int col) {
		 return matrix[row][col];
		}
		
/** Method sets a position specified by the user through row and column coordinates to a desired value also given by user
 * 
 * @param row Desired row coordinate
 * @param col Desired column coordinate
 * @param newObject Desired string object to be stored at location
 */
		
		public void setObject(int row, int col, String newObject) {
		 matrix[row][col] = newObject; 
		}
		
/** Method returns Snake object theSnake
 * 
 * @return theSnake the representation of the snake
 */
		public Snake getSnake() {
		 return theSnake;
		}
		
/** Method sets theSnake object to a user desired object of type Snake
 * 
 * @param newSnake the representation of the snake
 */
		public void setSnake(Snake newSnake) {
		 theSnake = newSnake;
		}
		
/** Method returns board length
 * 
 * @return board_length the length of the game board
 */
		
		public int getLength() {
		 return this.board_length;
		}
		
/** Method return board width
 * 
 * @return board_width the width of the game board
 */
		
		public int getWidth() {
		 return this.board_width;
		}
		
/** Method returns matrix at a specified row and column
 *  
 * @param row User's desired row coordinate
 * @param col User's desired column coordinate
 * @return String object at position on boards
 */
		public String getType(int row, int col) {
		 return matrix[row][col];
		}
		}
