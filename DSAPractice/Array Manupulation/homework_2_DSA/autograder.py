import importlib.util
import sys

def load_submission(path):
    """Dynamically loads the student's submission given the file path."""
    spec = importlib.util.spec_from_file_location("submission", path)
    submission = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(submission)
    return submission.FirstUnique

def run_public_tests(FirstUniqueClass):
    print("Running Public Test Cases")
    tests = [
        # Test Case 1: Basic functionality
        ([2, 3, 5], [("add", 2), ("add", 3)], 5),
        # Test Case 2: Adding a unique number after non-uniques
        ([2, 2, 3, 3], [("add", 4)], 4),
        # Test Case 3: Empty initialization
        ([], [("add", 1)], 1),
        # Test Case 4: Repeatedly adding the same number
        ([1], [("add", 1), ("add", 1), ("add", 1)], -1),
        # Test Case 5: Sequence of unique numbers
        ([], [("add", 7), ("add", 8), ("add", 9), ("add", 10)], 7),
    ]

    score = 0
    for initial_nums, operations, expected_output in tests:
        first_unique = FirstUniqueClass(initial_nums)
        for method, param in operations:
            getattr(first_unique, method)(param)
        output = first_unique.showFirstUnique()
        if output == expected_output:
            print(f"Test Passed: Initial Nums: {initial_nums} Operations: {operations} -> Output: {output}")
            score += 1
        else:
            print(f"Test Failed: Initial Nums: {initial_nums} Operations: {operations} -> Output: {output} (Expected: {expected_output})")
    
    print(f"\nPublic Test Cases Score (NOT YOUR FINAL SCORE!): {score}/{len(tests)}")
    return score


if __name__ == "__main__":
    from FirstUniqueSubmission import FirstUnique  # Ensure the submission file is correctly imported
    run_public_tests(FirstUnique)
    print("\nAll tests completed.")
