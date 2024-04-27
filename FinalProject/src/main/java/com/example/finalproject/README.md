# Handwritten Number Recognizer
This project is a handwritten number recognizer implemented in Java using JavaFX for the GUI and TensorFlow based model for number recognition.<br>
The user can draw numbers (0-9) using a touch screen or mouse on the GUI, and the program will predict the drawn number using a pre-trained TensorFlow model.

## Setup
### Dependencies
- This project requires Java 8 and JavaFX for GUI. <br>
- For number recognition model - tensorflow, Python 3.11.5.

### Requirements
- Setup
- Java Development Kit (JDK)
- Python
- TensorFlow
- JavaFX
- Matplotlib, numpy (Optional - only to train the model)

### Installation
- Clone this repository.
- Install the required dependencies listed above.
- Make sure the TensorFlow model file (number_recognizer_model2.py) is in the correct directory [Should be under same Final Project Directtory].
- Set up the absolute path of the file "number_recognizer_model2.py" [Copy the absolute path of the file "number_recognizer_model2.py"] after cloning in line 140 of "Event_handler_canvas.java" file
- Make sure the trained model "handwritten_digit_model2.h5" is in the same working directory[Should be under same Final Project Directtory].
- Set up the absolute path of the file "handwritten_digit_model2.h5" [Copy the absolute path of the file "handwritten_digit_model2.h5"] after cloning in line 73 of "number_recognizer_model2.py" file
- Build and run the JavaFX application(GUI_Number_Recognizer.java).

### Files
- GUI_Number_Recognizer.java
  - Purpose: Entry point of the JavaFX application. 
  - Contents: Contains the main method to launch the application.
- Event_handler_canvas.java
  - Purpose: Handles the events on the Canvas
  - Contents: Contains various functions to handle the events happening the UI(Mouse pressed, Mouse Dragged, Button actions) and the Model trigger
- Canvas_EventHandler.java
  - Purpose: Interface for handling mouse on a canvas.
  - Contents: contains the methods for Mouse pressed and Mouse Dragged
- Image_processing.java
  - Purpose: Class for proceesing the image
  - Contents: contains the methods resizing the image and save the image as .png file
- number_recognizer_model2.py
  - Purpose: This file has the Tensor flow based model training, accuracy, loss tests and model is saved and loaded here for prediction using new images of number
  - Contents: contains Model training and digit recognition.
- handwritten_digit_model2.h5 : this is the trained model, which is loaded to predict new number images.

### Class Diagram (UML Diagram)
![Class Diagram](Class_Diagram.png)
### Usage
- Launch the application.
- Draw a number on the canvas using the touch screen or mouse (anything between 0-9).
- Click the "PREDICT" button to predict the drawn number.
- <font color='red'>Please note that it take 5 seconds to predict the number, so a wait time for 5 seconds is added in the code.</font>
- After 5 Seconds, the pre-processed image is displayed, view it and close it. 
- Upon closing the predicted number displayed in the output field in GUI.
- The predicted number will be displayed on the output field of GUI.
![Demo of Usage and functioning](Usage_demo.gif)


### Image Processing
- The image processing is done using the ImageProcessing.java file. <br>
- This file pre-processes the drawn image by resizing it to 28x28 pixels and saving it in the correct format for TensorFlow prediction.
- After drawing the number on the canvas, click predict, before prediction , the image snapshot is taken and pre-processed to 28x28 pixels and converted to grayscale.
- Later this pre-processed image is passed to the Prediction Model.
- The Pre-processed Image looks as follows:
![Image after ](Img_after_pre_process.png)
### Training (Optional)
If you wish to train the TensorFlow model with different data:

- Prepare your training dataset.
- Train the model using TensorFlow. Uncomment model training in number_recognizer_model2.py
- Save the trained model as number_recognizer_model2.py in the appropriate directory.

### Tests
#### Test 1: Mouse Input
- Description: Drawing numbers using a mouse.
- Steps: Run the application, draw numbers using the mouse, click "PREDICT"
- Expected Result: The drawn number is correctly recognized, predicted and displayed.
![GIF  of input from Mouse](Demo.gif)

#### Test 2: Touch Screen Input
- Description: Drawing numbers using a touch screen(laptop).
- Steps: Run the application, draw numbers using touch screens, click "PREDICT"
- Expected Result: The drawn number is correctly recognized, predicted and displayed.
![GIF  of input from Mouse](Demo2.gif)

#### Test 3: Tested number recognition from digits 0-9
- Description: Drawing numbers using a touch screen(laptop)/Mouse.
- Steps: Run the application, draw numbers using touch screens, click "PREDICT"
- Expected Result: The drawn number is correctly recognized, predicted and displayed.
![number1](img0.png)
![number1](img1.png)
![number1](img2.png)
![number1](img3.png)
![number1](img4.png)
![number1](img5.png)
![number1](img6.png)
![number1](img7.png)
![number1](img8.png)
![number1](img9.png)

## Citation

- Geron,A.(2017). Hands-On Machine Learning with Scikit-Learn & TensorFlow(1st Ed.).O'REILLY

- JavaFX - Quick Guide. (n.d.). https://www.tutorialspoint.com/javafx/javafx_quick_guide.htm

- JavaFX - Layout BorderPane. (n.d.). https://www.tutorialspoint.com/javafx/layout_borderpane.htm

- JavaFX - Quick Guide. (n.d.-b). https://www.tutorialspoint.com/javafx/javafx_quick_guide.htm

- BorderPane (JavaFX 8). (2015, February 10). https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html

- GeeksforGeeks. (2021, September 1). JavaFX BorderPane Class. GeeksforGeeks. https://www.geeksforgeeks.org/javafx-borderpane-class/

- GeeksforGeeks. (2018, September 18). JavaFX Font Class. GeeksforGeeks. https://www.geeksforgeeks.org/javafx-font-class/

- JavaFX CSS Reference Guide. (n.d.). https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
- Redhia, A. (2023, November 28). Handwritten Digit Recognition - Azka Redhia - Medium. Medium. https://medium.com/@azkardm/handwritten-digit-recognition-4dc904edb515
- Wikipedia contributors. (2024, April 25). MNIST database. Wikipedia. https://en.wikipedia.org/wiki/MNIST_database
- Redhia, A. (2023, November 28). Handwritten Digit Recognition - Azka Redhia - Medium. Medium. https://medium.com/@azkardm/handwritten-digit-recognition-4dc904edb515
## Credits
- Author: Anvitha Hiriadka
- Created on: 04/27/2024