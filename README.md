# DFA-String-Acceptance-Checker

## 📕**Overview**

LabActivity1_DFA is a Java program that simulates a Deterministic Finite Automaton (DFA) designed to check whether a given binary string (0 and 1 only) is accepted or rejected based on predefined transition rules.
It runs interactively in the terminal and allows users to test multiple strings until they choose to exit.

## ⚙️**How It Works**

        The DFA has three states: q0 → q1 → q2
        - Start state: q0
        - Accepting (final) state: q2

## 🔁 **Transition Table**

| **Current State** | **Input = 0** | **Input = 1** |
|--------------------|---------------|---------------|
| `q0` *(start)* | `q1` | `q0` |
| `q1` | `q1` | `q2` |
| `q2` *(final)* | `q1` | `q0` |

- The program reads each binary digit (0 or 1) one by one and follows the transition rules.

- If the DFA ends in state q2, the input string is Accepted.
Otherwise, it is Rejected.

## 🧩 **Language**

{w∈{0,1}∗∣w ends with 01}

In Words: All binary strings (0,1) that ends with the substring 01.

# 🧑‍💻 **Example Output**
