import { useState } from "react";

function ThemeToggle() {
    const [theme, setTheme] = useState("light");
    function changeTheme() {
        setTheme((theme === "light" ? "dark" : "light"));
    }
    return (
      <div className={theme}>
        <h1>Theme Toggle Example</h1>
        <p>Current theme: {theme}</p>
        <button onClick={changeTheme}>Toggle Theme</button>
      </div>
    );
  }
export default ThemeToggle;