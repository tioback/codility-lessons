# Count Factors

This module contains an implementation and tests for the "Count Factors" lesson.

Files included:
- `src/main/java` — implementation
- `src/test/java` — tests
- `srt/test/resources/` — test inputs
- `chat-log.md` — notes from the chat with AI
- `lessons-learned.md` - observations and lessons learned from the task

Run tests with: `./gradlew :lessons:10_prime_and_composite_numbers:count_factors:test`

## Problem description 

<sub>Based on Codility's task [CountFactors](https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/) from lesson 10 - Prime and Composite Numbers.</sub>

### Objective

Implement an **efficient** function to calculate the total number of positive divisors (called factors on the problem) for a given positive integer $N$. 

A divisor of $N$ is any integer $D$ that divides $N$ evenly (leaving no remainder). 

$D$ is considered a factor of $N$ because the components of a multiplication are called *factors* and ${D \times M = N}$, where $M$ is also an integer.

### Technical Specifications

* Input: An integer $N$ within the range ${[1 \ldots 2\\,147\\,483\\,647]}$.
* Output: The count of all unique factors of $N$.
* $D$ is a positive integer.
* Example: For ${N = 24}$, the function returns $8$ (Factors: ${\{1, 2, 3, 4, 6, 8, 12, 24\}}$).