import React from 'react';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import Paper from '@material-ui/core/Paper';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';
import EditIcon from '@material-ui/icons/Edit';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';
import CardMedia from '@material-ui/core/CardMedia';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

const useStyles = makeStyles((theme) => ({
  text:{
    width:'60%',
    margin:theme.spacing(1),
  },
  root: {
    height: '100vh',
  },
  image: {
    backgroundRepeat: 'no-repeat',
    backgroundColor:
      theme.palette.type === 'light' ? theme.palette.grey[50] : theme.palette.grey[900],
    backgroundSize: 'cover',
    backgroundPosition: 'center',
  },
  paper: {
    margin: theme.spacing(8, 4),
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main,
  },
  form: {
    width: '100%', // Fix IE 11 issue.
    marginTop: theme.spacing(1),
  },
  submit: {
    margin: theme.spacing(3, 0, 2),
  },
}));

export default function UserInfo() {
  const classes = useStyles();
  const [open, setOpen] = React.useState(false);

  const handleClickOpen = () => {
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  return (
    <Grid container>

      <Grid xs={12}>
      <Card >
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            My Profile
          </Typography>

          <TextField
          id="standard-read-only-input"
          label="Name"
          defaultValue="Srikar"
          className={classes.text}
          InputProps={{
            readOnly: true,
          }}
        />

        <TextField
          id="standard-read-only-input"
          label="Mobile Number"
          className={classes.text}
          defaultValue="7894561230"
          InputProps={{
            readOnly: true,
          }}
        />

        <TextField
          id="standard-read-only-input"
          label="Email ID"
          className={classes.text}
          defaultValue="qwert@yuiop.com"
          InputProps={{
            readOnly: true,
          }}
        />

        <TextField
          id="standard-read-only-input"
          label="Password"
          className={classes.text}
          defaultValue="********"
          InputProps={{
            readOnly: true,
          }}
        />

        </CardContent>
      <CardActions >
        <Button size="medium" color="secondary" variant="contained"  startIcon={<EditIcon />} onClick={handleClickOpen}>
          Edit
        </Button>
      </CardActions>
    </Card>
      <Dialog
        open={open}
        onClose={handleClose}
        aria-labelledby="alert-dialog-title"
        aria-describedby="alert-dialog-description"
      >
        <DialogTitle id="alert-dialog-title">{"Edit Profile"}</DialogTitle>
        <DialogContent>
          <DialogContentText id="alert-dialog-description">

          <TextField
          id="standard-read-only-input"
          label="Name"
          defaultValue="Srikar"
          className={classes.text}
        />

        <TextField
          id="standard-read-only-input"
          label="Mobile Number"
          className={classes.text}
          defaultValue="7894561230"
        />

        <TextField
          id="standard-read-only-input"
          label="Email ID"
          className={classes.text}
          defaultValue="qwert@yuiop.com"
        />

        <TextField
          id="standard-read-only-input"
          label="New Password"
          className={classes.text}
        />

        <TextField
          id="standard-read-only-input"
          label="Retype New Password"
          className={classes.text}
        />

          </DialogContentText>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose} color='secondary' variant="contained">
            Cancel
          </Button>
          <Button onClick={handleClose} color="primary" variant="contained" autoFocus>
            Submit
          </Button>
        </DialogActions>
      </Dialog>

      </Grid>
      
    </Grid>
  );
}