# Part 1

## Set 1
1.The bug never stay in its original position without moving. But it will stay in a constant patter of moving across the grid.  
2.And direction that its head is pointing at  
3.It rotates
4. Flowers
5. Rotates 90 degrees  
6. It will rotate 45 degrees checks to see if there is a rock and then rotates another 45 degrees and goes forward along that direction  
7.No
8. Changes color when bug steps on it and gradually turns darker as the bug moves away from it  
9.Rocks can move if you use the method move and also change color
10.No, bugs and flowers cannot be on the same grid, the bug creates a new flower and the bug will avoid rocks  

### Exercises   
1. 0 : North
   45: North East  
   90: East  
   135:South East  
   180:South  
   225:South West  
   270 :West
   315 :North west
   360:North  
2.You can move up down and side to side however, if the bug moves and is out of bounds or outside the grid, an error message will be thrown out.  
3.void setColor  
4.The bug disappeared from the screen    

# Part 2

## Set 2  

1.sideLength is the length of the box that BoxBug travels in  
2.steps tracks how many steps the boxbug moves so that it moves that specific amount  
3.It is called twice because it only turns the bug 45 degrees and in order to make a complete turn you must turn ninety degrees so the turn is called twice.  
4. Because the move function is inherited from the super class Bug.  
5.No you cannot change the square pattern as in there are no methods in which you change the variable sideLength so once the bug is constructed it cannot be changed!  
6. If there are obstacles in the path of the boxBug it will change its path.  
7.Once you turn twice.  

### Exercises  
1.  CircleBug is different because it only turns once instead of twice which makes it move in a circular path instead of a square.Other than that it is very similiar.  

2. Spiral bug moves in a spiral and every single bug created is basically going to do what its name tell you.  

5. Check out the src code!    


# Part 3  

## Set 3  

1.loc1.getRow();  
2. false  
3.(3,5)    
4.South east  
5. You pass in the direction and the starting location, as the program translates the direction into coordinates, then it will execute and return the tile that has those transformations on the original.  

## Set 4    
1. Gets the count of objects in a grid by getting the size of the ArrayList for get occupied Location and get a count of the empty locations in a bounding grid by subtracting that number from the total number of grid spaces.  

2. the isValid() method  

3. The implementations would be found in the classes that use this interface!  

4.No because ArrayLists are much more flexible for adjusting values in an array and can have adjusted values and different lengths based on the information passed to them.    

## Set 5 

1. Color, direction and location  
2. Default color is red and direction is north 
3. The Actor class was created as a class because there are default methods for all actors and it wouldn't feasible to write all the methods within all the subclasses. There needs to be a class where you can inherit methods.  
4.No,and actor cannot be put onto a grid twice without removing itself and it can't remove itself twice. However it can be placed , remove itself and put back.  
5. An actor has the method turn() which will turn it 45 degrees  and so to turn 90 degrees to the right , you would call turn twice.  


## Set 6  
1. It calls the isValid() method to check if the place its moving to is on the grid.  
2.It checks to see if its neighboring space is either empty or a flower in which case it moves.  
3. isValid() and get() to validate its moves  
4. getAdjacentLocation()    
5. getLocation()    
6.isValid() will return false and it will remove itself from the grid.    
7.It's not needed but it is better to have the data stored in the variable to reduce clutter and the make the code dry.    
8.Because it inherits the bugs color.    
9.No because it's not moving and placing a flower is part of move    
10.flower.putSelfInGrid(gr, loc);    
11.4 times;  

## Group Questions  

### 1.Specify  
a) It will move one space and jump over the obstacle on the next jump.  
b)It will jump once and turn 90 degrees.  
c)It will turn 90 degrees and resume jumping
d)It will delete the actor (technically kill it)  
e) They will kill each other.
f) I don't think so.    

### 2.Design  
a) Bug  
b) Not really, there aren't any bugs that have the same functionality as Jumper  
c) Yes there should be a constructor, the parameter should be the grid
d) The act method should be overridden and  the constructor as well and canMove() should be overridden and so should move()
e) canJump() to test whether the bug can jump and a delete method to delete other bugs and move to their space  
f) Creating an obstacle course for the bug involving other actors, other jumpers, rocks, flowers, and a limited grid space  

### Code  
Check the src code  

### Testing  
The jumper indeed killed all other actors accept for flowers and jumped 2 spaces! It did exactly what we wanted to do.






