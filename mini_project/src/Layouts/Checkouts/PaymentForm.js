import React from 'react';
import Typography from '@material-ui/core/Typography';
import Grid from '@material-ui/core/Grid';
import TextField from '@material-ui/core/TextField';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Checkbox from '@material-ui/core/Checkbox';
import RadioGroup from '@material-ui/core/RadioGroup';
import FormControl from '@material-ui/core/FormControl';
import FormLabel from '@material-ui/core/FormLabel';
import Radio from '@material-ui/core/Radio';


export default function PaymentForm() {
  const [value, setValue] = React.useState('female');

  const handleChange = (event) => {
    setValue(event.target.value);
  };
  return (
    <React.Fragment>
      <FormControl component="fieldset">
              <FormLabel component="legend">Select Mode</FormLabel>
              <RadioGroup aria-label="user" name="gender1" value={value} onChange={handleChange}>
                <FormControlLabel value="customer" control={<Radio />} label="Regular" />
                <FormControlLabel value="owner" control={<Radio />} label="One time" />
              </RadioGroup>
            </FormControl>
    </React.Fragment>
  );
}