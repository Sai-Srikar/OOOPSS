import React from 'react';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import WorkOutlineOutlinedIcon from '@material-ui/icons/WorkOutlineOutlined';
import HomeOutlinedIcon from '@material-ui/icons/HomeOutlined';
import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';

const useStyles = makeStyles((theme) => ({
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

export default function Addresses() {
  const classes = useStyles();

  return (
    <Grid container>

      <Grid xs={12} md={6}>
        <Paper elevation={2}>
        <WorkOutlineOutlinedIcon />
        <HomeOutlinedIcon />
        <LocationOnOutlinedIcon />
        </Paper>
      </Grid>
    </Grid>
  );
}