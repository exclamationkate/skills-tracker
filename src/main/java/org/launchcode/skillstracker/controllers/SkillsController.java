package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsList() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                         "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    /*
    // Select form
    @GetMapping("form")
    public String favoriteSkillsForm() {
        return "<html>" +
                    "<body>" +
                        "<form method='post' action='my-list'>" +
                            "<label for='name'>Name:</label>" + "<br>" +
                            "<input type='text' name='name' id='name'>" + "<br>" +
                            "<label for='first'>My favorite language:</label>" + "<br>" +
                            "<select name='first' id='first'>" +
                                "<option value=''>Please select:</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" + "<br>" +
                            "<label for='second'>My second favorite language:</label>" + "<br>" +
                            "<select name='second' id='second'>" +
                                "<option value=''>Please select:</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" + "<br>" +
                            "<label for='third'>My third favorite language:</label>" + "<br>" +
                            "<select name='third' id='third'>" +
                                "<option value=''>Please select:</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" + "<br>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
     */

    // Form as a table with radio selection
    @GetMapping("form")
    public String favoriteSkillsForm() {
        return "<html>" +
                    "<body>" +
                        "<form method='post' action='my-list'>" +
                            "<table border='1'>" +
                            "<tr>" +
                                "<th><label for='name'>Name:</label></th>" +
                                "<td><input type='text' name='name' id='name'></td>" +
                            "</tr>" +
                            "</table>" + "<br>" +
                            "<table border='1'>" +
                            "<tr>" +
                                "<th><label for='first'>My favorite language:</label></th>" +
                                "<td><label><input type='radio' name='first' id='first' value='Java' checked>Java</label></td>" +
                                "<td><label><input type='radio' name='first' id='first' value='JavaScript'>JavaScript</label></td>" +
                                "<td><label><input type='radio' name='first' id='first' value='Python'>Python</label></td>" +
                            "</tr>" +
                            "<tr>" +
                                "<th><label for='second'>My second favorite language:</label></th>" +
                                "<td><label><input type='radio' name='second' id='second' value='Java' checked>Java</label></td>" +
                                "<td><label><input type='radio' name='second' id='second' value='JavaScript'>JavaScript</label></td>" +
                                "<td><label><input type='radio' name='second' id='second' value='Python'>Python</label></td>" +
                            "</tr>" +
                            "<tr>" +
                                "<th><label for='third'>My third favorite language:</label></th>" +
                                "<td><label><input type='radio' name='third' id='third' value='Java' checked>Java</label></td>" +
                                "<td><label><input type='radio' name='third' id='third' value='JavaScript'>JavaScript</label></td>" +
                                "<td><label><input type='radio' name='third' id='third' value='Python'>Python</label></td>" +
                            "</tr>" +
                            "</table>" + "<br>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    /*
    // Form returned as ordered list
    @PostMapping("my-list")
    public static String createSkillsList(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + first + "</li>" +
                            "<li>" + second + "</li>" +
                            "<li>" + third + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
     */

    // Form returned as table
    @PostMapping("my-list")
    public static String createSkillsList(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                    "<body>" +
                    "<h1>" + name + "</h1>" +
                        "<table border='1'>" +
                            "<tr>" +
                                "<th>Favorite</th>" +
                                "<td>" + first + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<th>Second Favorite</th>" +
                                "<td>" + second + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<th>Third Favorite</th>" +
                                "<td>" + third + "</td>" +
                            "</tr>" +
                        "</table>" +
                    "</body>" +
                "</html>";
    }

}
