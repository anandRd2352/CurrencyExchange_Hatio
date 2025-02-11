    package com.myapp.currency_exchange.model;


    public class ConversionResponse {
        private String from;
        private String to;
        private double amount;
        private double convertedAmount;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getConvertedAmount() {
            return convertedAmount;
        }

        public void setConvertedAmount(double convertedAmount) {
            this.convertedAmount = convertedAmount;
        }

        public ConversionResponse(String from, String to, double amount, double convertedAmount) {
            this.from = from;
            this.to = to;
            this.amount = amount;
            this.convertedAmount = convertedAmount;
        }

        public ConversionResponse() {

        }

        @Override
        public String toString() {
            return "CurrencyConversionResponse{" +
                    "from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", amount=" + amount +
                    ", convertedAmount=" + convertedAmount +
                    '}';
        }
    }

