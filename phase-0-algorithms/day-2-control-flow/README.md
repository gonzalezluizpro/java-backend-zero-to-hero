# Day 02 - Control Flow & Menus

## Overview

Day 02 focuses on practicing core control flow structures in Java:
- `if / else if / else`
- `while`
- `do-while`
- `for`

The goal is to think in terms of rules, state, and flow, not just syntax.

## Files

- `Problem01AgeCategory.java`  
  Classify a person into an age category (Child, Teenager, Adult, Senior) based on business rules.

- `Problem02PasswordChecker.java`  
  Simulate a password check with limited attempts using a `do-while` loop.

- `Problem03OddCounter.java`  
  Print odd numbers within a range using a `while` loop.

- `Problem04MultiplicationTable.java`  
  Print the multiplication table of a given number using a `for` loop.

## Concepts Practiced

- Clear and readable control flow
- Branching with `if / else if / else`
- Looping with `while`, `do-while`, and `for`
- Basic state tracking with counters and variables
- Deterministic and predictable outputs

## Engineering Mindset Rules

Applied in this day:

- Code must be readable by another engineer  
- No magic numbers (or keep them clearly tied to business rules)  
- Clear method and variable names  
- Explicit validation  
- Predictable outputs  
- Think in rules, state, and flow

## Why this matters in enterprise systems

In enterprise systems, **control flow is business logic**: age categories, access rules, limits, and thresholds are all encoded as conditions and branches.  
Getting comfortable with `if / else` and loops is the first step toward implementing real-world rules such as pricing, eligibility, and feature flags.

Loops with counters and state are the foundation for **rate limiting, retries, and monitoring**.  
Patterns like “maximum attempts”, “retry until success”, or “process items until a condition is met” are everywhere in backend services (authentication, message processing, batch jobs).

Readable control flow and explicit validation make systems **maintainable and auditable**.  
Other engineers must be able to quickly understand why a request was accepted, rejected, or limited, which is critical in regulated environments (finance, banking, insurance).

Practicing these ideas early builds the mindset needed for advanced topics such as **service orchestration, workflow engines, and resilient distributed systems**.  
What looks like a simple console loop today becomes the conceptual basis for robust production flows tomorrow.
