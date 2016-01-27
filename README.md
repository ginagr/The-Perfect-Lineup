# the-perfect-lineup

This is the Develop Branch of the Perfect Lineup. It serves as the base branch for devvelopment and is periodically merged with the master branch

The Structure is as follows:

  
    0------------master--------------------------------------------------------------------------
      \----------develop--------------------------------------------------------------------/-----------
        \            \--feature 2--------------/------------/
         \                                    /
          \-----------------feature 1 -------/

master: Has periodical, stable releasses (eg. v 1.0.0)
develop: is the ongoing development branch. Periodically merged with master. All merge conflicts are resolved on this branch. Make sure to fetch often.
feature branches: all code is written on these branches. Features have to work before merging them with develop.

