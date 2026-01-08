<!-- Title: use conventional commit style, e.g. `feat(lesson): add 10_prime_and_composite_numbers/count_factors initial solution` -->

## Description
Short description of the change (1-2 sentences).

**Lesson path**: `lessons/<topic>/<lesson>`

## Included files
- `src/main/java` — initial solution (optional on first draft)
- `src/test/java` — tests (prefer Codility sample cases when applicable)
- `README.md` — lesson notes, explanation, references
- `chat-log.md` — notes from AI / design discussion (optional)
- `test-data/` — sample input files (optional)

## How to run locally
```bash
# Run tests for this lesson module (example)
./gradlew :lessons:<topic>:<lesson>:test
```

## Checklist
- [ ] I added tests for the behavior I implemented (or documented why not)
- [ ] Lesson artifacts are placed under `lessons/<topic>/<lesson>/` (no top-level `src/`)
- [ ] Project builds and tests run locally
- [ ] I documented trade-offs or known limitations in the lesson README

## Notes for reviewers
(What do you want reviewed? algorithm correctness, performance, style, test coverage, etc.)
