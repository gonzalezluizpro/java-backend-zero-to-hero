# Day 01 - Conditions & Basic Logic

## Overview

Day 01 introduces conditional logic and basic decision-making in Java:
- `if / else` statements
- Method extraction
- Basic validation rules
- **SOLVED vs UNSOLVED** pattern to understand evolution of requirements

## Files

- `Problem01AgeValidatorSolved.java`  
  Simple age validation (≥ 18).

- `Problem01AgeValidatorUnsolved.java`  
  Advanced version with additional business rules.

- `Problem02MenuSolved.java`  
  Basic menu with `Scanner` input and `do-while` loop.

- `Problem02MenuUnsolved.java`  
  Enhanced menu with validation and more features.

- `Problem03DiscountCalculatorSolved.java`  
  Basic discount calculation based on value.

- `Problem03DiscountCalculatorUnsolved.java`  
  Advanced version with multiple rules.

- `Problem04DataListSolved.java`  
  Basic in-memory list operations.

- `Problem04UserListUnSolved.java`  
  Enhanced version with more sophisticated requirements.

## Concepts Practiced

- Conditional logic with `if / else`
- Method extraction for reusability
- Input validation
- **SOLVED vs UNSOLVED** pattern for requirement evolution
- Basic state management with variables

## Engineering Mindset Rules

Applied in this day:

- Code must be readable by another engineer  
- Clear method names and explicit validation  
- Predictable outputs  
- Think in rules, state, and flow (not syntax)  
- Business rules explicitly encoded as conditions

## Why this matters in enterprise systems

**Conditional logic IS business logic.** Every eligibility rule, discount, validation, and authorization decision is an `if / else` chain at its core.

In enterprise systems, **SOLVED → UNSOLVED** is the natural evolution of requirements:
- "Allow age ≥ 18" → "Also handle seniors, invalid ages, and different messages"
- Simple rules grow into complex eligibility engines (KYC, credit scoring, feature flags).

**Method extraction** and **validation** make business rules **testable and auditable**.  
Regulated industries (banking, insurance) need explicit, readable decision points for compliance and debugging.

**Input validation** prevents **garbage data** from corrupting business flows.  
Every console `Scanner` today becomes a REST API `@Valid` DTO tomorrow.

This foundation enables you to understand **why** a transaction was approved/rejected, **how** discounts were calculated, and **what** validation failed – critical skills for production debugging and business analysis.

Practicing requirement evolution (SOLVED → UNSOLVED) builds the **iterative development** muscle needed for real-world feature growth.
