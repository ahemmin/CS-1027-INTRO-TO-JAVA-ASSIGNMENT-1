/** Class that defines characteristics of the snake in the game
 * 
 * @author Hemming
 *
 */

public class Snake {
		 int snakeLength;
		 Position[] snakeBody;
		 
/** Constructor set the length of the snake to 1, creates an array of 5 Position objects and then intialized the first entry of the array with user specified parameters
 * 
 * @param row User's desired row coordinate
 * @param col User's desired column coordinate
 */
		 
public Snake(int row, int col) {
	this.snakeLength = 1;
	this.snakeBody = new Position[5];
	this.snakeBody[0] = new Position(row,col);
}

/** Method returns length of snake
 * 
 * @return snakeLength the length of the snake
 */

public int getLength() {
	return this.snakeLength;
}

/** Method returns the Position object at a user specified index if it exists in the array representing the snake
 * 
 * @param index User specifying which Position object they want
 * @return snakeBody[index] the Position object in the snake array at the specified index
 */

public Position getPosition(int index) {
	if (index < 0 || index >= snakeLength) {
		return null;
	}
	else {
		return snakeBody[index]; }
}

/** Method shortens the length of the snake by 1
 * 
 */

public void shrink() {
	this.snakeLength = this.snakeLength - 1;
}

/** Method determines if a user specified object of type Position exists in the array representing the snake
 * 
 * @param pos User's desired object of type Position
 * @return true, false
 */

public boolean snakePosition(Position pos) {
	boolean x = false;
	for (int i = 0 ; i < this.snakeLength ; i++) {
		if (snakeBody[i].equals(pos)) {
			x = true;
			System.out.println("1" + x);
		}
	}
	System.out.println("3" + x);
	return x;
}

/** Method performs necessary changes to the head of the snake according to a user desired direction (command)
 * 
 * @param direction User's desired direction of travel
 * @return snakeBody[0] the snake's new head position
 */

public Position newHeadPosition(String direction) {
	int row = snakeBody[0].getRow();
	int col = snakeBody[0].getCol();
	if (direction == "up") {
		--row;
	}
	else if (direction == "down") {
		++row;		
	}
	else if (direction == "left") {
		--col;		
	}
	else if (direction == "right") {
		++col;
	}
	return new Position(row,col);
}

/** Method is responsible for the movement of the snake in response to a user's desired direction
 * 
 * @param direction direction User's desired direction of travel
 */

public void moveSnake(String direction) {
	Position newpos = newHeadPosition(direction);
	if (snakeLength>=2) {
	for (int i = this.snakeLength-2 ; i >=0  ; --i ){
		this.snakeBody[i+1] = this.snakeBody[i];
	}
	}
	snakeBody[0]=newpos;
}

/** Method responsible for the growth of the snake in response to a given direction of travel
 * 
 * @param direction direction User's desired direction of travel
 */

public void grow(String direction) {
	Position newpos = newHeadPosition(direction);
	
	if (this.snakeLength == snakeBody.length) {
		increaseArraySize();
		}
	for(int i = snakeLength-1;i>=0;--i) {
		this.snakeBody[i+1] = this.snakeBody[i];
	}
	snakeBody[0]=newpos;
	this.snakeLength = this.snakeLength +1;
	
}

/** Method increases size of the snake array so that it can continue to grow (otherwise would be length constricted)
 * 
 */
private void increaseArraySize() {
	Position[] Larger_list = new Position[this.snakeBody.length * 2];
	for (int i = 0 ; i < this.snakeBody.length ; i++) {
		Larger_list[i] = this.snakeBody[i];
	}
	this.snakeBody = Larger_list;
}
}
