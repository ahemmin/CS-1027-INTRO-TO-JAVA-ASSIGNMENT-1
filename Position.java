/** 
 * Class that defines the characteristics of an an object Position that represents any location on the game board
 * @author Hemming
 *
 */

public class Position {
		 int positionRow;
		 int positionColumn;

/** Constructor initializes instance variables representing the row and col coordinates and sets them to the users desired values
 * 
 * @param row Row coordinate
 * @param col Column coordinate
 */
		 
		 public Position(int row, int col) {
		 this.positionRow = row;
		 this.positionColumn = col;
		}
		 
/** Method returns row coordinate of object Position
 * 
 * @return positionRow The row coordinate of object Position
 */
		 
		public int getRow() {
		 return this.positionRow;
		}
		
/** Method returns column coordinate of object Position
 * 
 * @return positionColumn The column coordinate of object Position
 */
		public int getCol() {
		 return this.positionColumn;
		}
		
/** Method sets row coordinate to a user desired value
 * 
 * @param newRow User's desired row coordinate for an object of type Position
 */
		
		public void setRow(int newRow) {
		 this.positionRow = newRow; 
		}
		
/** Method sets column coordinate to a user desired value
 * 
 * @param newCol User's desired column coordinate for an object of type Position
 */
		
		public void setCol(int newCol) {
		 this.positionColumn = newCol;
		}
		
/** Method checks if the coordinates of one object of type Position is the same as another
 * 
 * @param otherPosition User's chosen Position object to be compared with the Position object it is being used on
 * @return true, false for comparison
 */
		public boolean equals(Position otherPosition) {
		 if (this.positionRow == otherPosition.getRow() && this.positionColumn == otherPosition.getCol())
			 return true;  
		 else
			 return false;
		}
		}
