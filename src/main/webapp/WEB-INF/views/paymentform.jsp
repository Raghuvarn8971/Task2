<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <title>Payment Form</title>
</head>
<body>
    <h1>Payment Form</h1>
    
    <form action="/api/payments/razorpay/create-order" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" required><br><br>

        <label for="emailAddress">Email Address:</label>
        <input type="email" id="emailAddress" name="emailAddress" required><br><br>

        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required><br><br>

        <label for="paymentDescription">Payment Description:</label>
        <input type="text" id="paymentDescription" name="paymentDescription" required><br><br>

        <input type="submit" value="Pay Now">
    </form>

</body>
</html>