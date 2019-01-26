# Project Title

This project is a loan comparison calculator that uses text field input to calculate and display
a table that summarizes user's loan amount and term in the range of 5% - 8% interest rate.
## Example Output

This image will display as your example output. Name the image README.jpg in your project folder.

![Sample Output](README.jpg)

## Analysis Steps

The project is a window with 2 text fields, a button, and a text area.
There needs to be some math logic that happens when the button is clicked
and the table for the results will be printed into the text area.

### Design

I assembled the program from the top down since it's so simple.
Once I had the layout in a satisfactory state, I set to making the mechanics 
of the page function properly. I then cleaned up the style and table formatting.


### Testing

I tested this program after adding each element by starting and stopping the program.
this was a tedious process when formatting the table for alignment.

I additionally tested out a textFlow field instead of a textArea, and experimented 
with some other styles. 

I tested the logic and discovered that user can attempt to calculate with improper char 
input, and the program will throw exceptions but continue to function properly when the
field is deleted and proper values are entered.

## Notes

I had initial issues with the printing the table to a text area, but figured it out quickly.

## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
