package com.pluralsight;
import java.util.Scanner;
public class FinancialCalculator2 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Welcome to the Financial Calculator");
        System.out.println("(M) Mortgage Calculator");
        System.out.println("(C) CD Calculator");
        System.out.print("Select a Calculator: ");
        String calculatortype = myscanner.nextLine();
        System.out.println();
        if(calculatortype.equalsIgnoreCase("M")) {
            System.out.println("Welcome To The Mortgage Calculator");
            System.out.println("Enter the Loan Principal: ");
            double LoanPrincipal = myscanner.nextDouble();
            System.out.println("Enter The Interest Rate: ");
            double InterestRate = myscanner.nextDouble();
            System.out.println("Enter The Length of the Loan(yrs): ");
            double LoanLength = myscanner.nextDouble();
            double MonthlyInterest = InterestRate / 100 / 12;
            double NumberofPayments = LoanLength * 12;
            double eResults = Math.pow(1 + MonthlyInterest, NumberofPayments);
            double MonthlyPayments = LoanPrincipal * (MonthlyInterest * eResults / (eResults - 1));
            double TotalPayment = MonthlyPayments * NumberofPayments;
            double TotalInterest = TotalPayment - LoanPrincipal;
            System.out.println("The Monthly Payment is : $" + MonthlyPayments);
            System.out.println("The interest is: " + TotalInterest);
        }

        else if (calculatortype.equalsIgnoreCase("C"))
            System.out.println("Welcome to the CD Calculator");
        System.out.println("Enter Deposit Amount: ");
        double PV = myscanner.nextDouble();
        System.out.println("Enter the Interest rate: ");
        double CdInterestRate = myscanner.nextDouble();
        System.out.println("Enter the number of years: ");
        double noy = myscanner.nextDouble();
        CdInterestRate /= 100;
        CdInterestRate += 1;
        double FV = Math.pow(CdInterestRate,noy);
        FV *= PV;
        double EarnedInterest = FV - PV;
        System.out.println("The Future Value of your CD is: $"+ FV);
        System.out.println("The Earned Interest is: "+EarnedInterest);


    }}
