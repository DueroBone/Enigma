package enigma;

public class EnigmaMachine {
  char intToChar(int input) {
    if (input == 1) {
      return 'A';
    } else if (input == 2) {
      return 'B';
    } else if (input == 3) {
      return 'C';
    } else if (input == 4) {
      return 'D';
    } else if (input == 5) {
      return 'E';
    } else if (input == 6) {
      return 'F';
    } else if (input == 7) {
      return 'G';
    } else if (input == 8) {
      return 'H';
    } else if (input == 9) {
      return 'I';
    } else if (input == 10) {
      return 'J';
    } else if (input == 11) {
      return 'K';
    } else if (input == 12) {
      return 'L';
    } else if (input == 13) {
      return 'M';
    } else if (input == 14) {
      return 'N';
    } else if (input == 15) {
      return 'O';
    } else if (input == 16) {
      return 'P';
    } else if (input == 17) {
      return 'Q';
    } else if (input == 18) {
      return 'R';
    } else if (input == 19) {
      return 'S';
    } else if (input == 20) {
      return 'T';
    } else if (input == 21) {
      return 'U';
    } else if (input == 22) {
      return 'V';
    } else if (input == 23) {
      return 'W';
    } else if (input == 24) {
      return 'X';
    } else if (input == 25) {
      return 'Y';
    } else if (input == 26) {
      return 'Z';
    } else {
      return ' ';
    }
  }

  int charToInt(char input) {
    if (input == 'A') {
      return 1;
    } else if (input == 'B') {
      return 2;
    } else if (input == 'C') {
      return 3;
    } else if (input == 'D') {
      return 4;
    } else if (input == 'E') {
      return 5;
    } else if (input == 'F') {
      return 6;
    } else if (input == 'G') {
      return 7;
    } else if (input == 'H') {
      return 8;
    } else if (input == 'I') {
      return 9;
    } else if (input == 'J') {
      return 10;
    } else if (input == 'K') {
      return 11;
    } else if (input == 'L') {
      return 12;
    } else if (input == 'M') {
      return 13;
    } else if (input == 'N') {
      return 14;
    } else if (input == 'O') {
      return 15;
    } else if (input == 'P') {
      return 16;
    } else if (input == 'Q') {
      return 17;
    } else if (input == 'R') {
      return 18;
    } else if (input == 'S') {
      return 19;
    } else if (input == 'T') {
      return 20;
    } else if (input == 'U') {
      return 21;
    } else if (input == 'V') {
      return 22;
    } else if (input == 'W') {
      return 23;
    } else if (input == 'X') {
      return 24;
    } else if (input == 'Y') {
      return 25;
    } else if (input == 'Z') {
      return 26;
    } else {
      return 0;
    }
  }

}