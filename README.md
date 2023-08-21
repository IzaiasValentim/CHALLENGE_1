<h1> About my progress on Challenge 01 </h1>

<h2>QUESTION - 01</h2>
  <p>  
    My implementation of the challenge consists of the main method as the main starting point and 3 auxiliary methods.In main, the program will run several instances by calling auxiliary methods or issuing defined outputs.
    <ul>
      <li>The number of students for the competition is validated in the "inputsValidation()" method and returned.</li>
      <li> Having the number of inputs, the program will proceed to the next method called "textInputs(number_of_inputs)" which receives the number of inputs and returns a list containing all the input information.</li>
      <li>The last method of the program flow "rank(List<String> students)" has the most complex processing. In it the input is a sorted list with Collections.sort() of the students. The processing consists of iterating each element of this list and obtaining the note expressed at the end of the String, being compared with the smallest value recorded in a variable. If the current value of the iteration is less than the registered value, we will have a new losing student for this iteration. The program will track all occurrences and finally output the unfortunated result.</li>
    </ul>
  </p>

<h2>QUESTION - 02</h2>
  <p>  
    My implementation of the challenge consists of the main method as the main starting point and 3 auxiliary methods.In main, the program will run and call auxiliary methods or issuing defined outputs.
    <ul>
        <li>In the "input_message()" method, the message to be analyzed is collected and returned in String format.</li>
        <li>The "count_of_ocourrences(String text, String symbol)" method receives the text entered by the user and a symbol to be searched for. It can count several             input symbols and is used for counting the two symbols in two different invocations of the method.</li>
        <li>The method "sentiment_expressed(int happy_faces, int upset_faces)" makes the difference between the two occurrence quantities and defines the sentiment of             the input.</li>
    </ul>
   </p>

<h2>QUESTION - 03</h2>
<p>  
  My implementation of the challenge consists of the main method as the main starting point and 3 auxiliary methods.In main, the program will run several instances by calling auxiliary methods or issuing defined outputs.
  <ul>
      <li>The purpose of the "collect_operators(String input)" method is to receive the operation text, filter and return in order all the addition and subtraction         operators of the calculation.</li>
      <li>In collect_numbers(String input), the text input is iterated and the numbers that will participate in the operation are collected and returned in the             original order of the operation.</li>
      <li>The third auxiliary method operation(List<String> operators, List<String> numbers, int operands), receives the list with the operators and another of the         operands, as well as the number of operands. Processing consists of iterating over the number of numbers developing the operator analysis logic and addition or       subtraction operation and outputting the result at the end.</li>

  </ul>
</p>

<h2>QUESTION - 04</h2>
  <p>  
    <ul>
      <li>The SQL script was created in pgAdmin 4 following the defined structure. At the end, it was exported in the standard file format.</li>
    </ul>
  </p>
