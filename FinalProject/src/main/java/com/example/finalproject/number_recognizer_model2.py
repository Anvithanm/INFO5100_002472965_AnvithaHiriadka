'''
========================================================================================================================
 * Author = Anvitha Hiriadka
 * Submitted on 04/27/2024
 * Handwritten Number Recognizer Model --> This file contains handwritten number recognizer using TensorFlow,
 leveraging convolutional neural networks (CNNs) to accurately classify digits from the MNIST dataset.
 * Achieved high accuracy in recognizing handwritten digits, demonstrating the effectiveness of deep learning
 techniques for image classification tasks
 The model here is trained and saved, which can be used for predicting number from new images of number
========================================================================================================================
'''
#Import the necessary libraries
import tensorflow as tf
from tensorflow.keras import layers, models
import numpy as np
from PIL import Image
import matplotlib.pyplot as plt
'''
# Load the MNIST dataset
mnist = tf.keras.datasets.mnist
(train_images, train_labels), (test_images, test_labels) = mnist.load_data()

# Normalize the pixel values to range [0, 1]
train_images, test_images = train_images / 255.0, test_images / 255.0

# Define the model architecture
model = models.Sequential([
    # Reshape input to 28x28x1 (grayscale)
    layers.Reshape((28, 28, 1), input_shape=(28, 28)),  
    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(28, 28, 1)),
    layers.MaxPooling2D((2, 2)),
    layers.Conv2D(64, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    layers.Flatten(),
    layers.Dense(64, activation='relu'),
    layers.Dense(10, activation='softmax')  # Output layer with 10 classes (0-9)
])

# Compile the model
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])

# Train the model
model.fit(train_images, train_labels, epochs=5, validation_data=(test_images, test_labels))

# Evaluate the model
test_loss, test_acc = model.evaluate(test_images, test_labels)
print('Test accuracy:', test_acc)

#Saving the Model
model.save("handwritten_digit_model2.h5")
'''
def recognize_digit(image_path):
    image = Image.open(image_path).convert('L')  # Convert to grayscale
    image = image.resize((28, 28))  # Resize to 28x28 pixels
    # Invert the colors (convert white writing to black and black background to white)
    inverted_image = Image.eval(image, lambda x: 255 - x)
    # Convert the image to a numpy array and normalize pixel values to [0, 1]
    image_array = np.array(inverted_image) / 255.0
    #image_array = np.array(image) / 255.0  # Normalize pixel values to [0, 1]

    # Reshape the image array to match the input shape expected by the model
    image_array = image_array.reshape((1, 28, 28))
    # Display the image
    plt.imshow(image_array[0], cmap='gray')
    plt.axis('off')
    plt.title('Input Image')
    plt.show()

    # Load the saved model
    # Please change the path here to the absolute path of handwritten_digit_model2.h5 after cloning this Final Project repositary
    loaded_model = tf.keras.models.load_model("/Users/anvithahiriadka/IdeaProjects/FinalProject/src/main/java/com/example/finalproject/handwritten_digit_model2.h5")
    predictions = loaded_model.predict(image_array)
    predicted_class = np.argmax(predictions)
    return predicted_class

# Load the image
image_path = "processed_image.png"
# Perform prediction
predicted_digit = recognize_digit(image_path)
#Printing the predicted digit
print("Predicted digit:", predicted_digit)
