import React from 'react';
import Avatar from '@material-ui/core/Avatar';
import Button from '@material-ui/core/Button';
import CssBaseline from '@material-ui/core/CssBaseline';
import TextField from '@material-ui/core/TextField';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Checkbox from '@material-ui/core/Checkbox';
import Link from '@material-ui/core/Link';
import Paper from '@material-ui/core/Paper';
import Box from '@material-ui/core/Box';
import Grid from '@material-ui/core/Grid';
import LockOutlinedIcon from '@material-ui/icons/LockOutlined';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import IconButton from '@material-ui/core/IconButton';
import FavoriteIcon from '@material-ui/icons/Favorite';
import ShareIcon from '@material-ui/icons/Share';
import MoreVertIcon from '@material-ui/icons/MoreVert';
import HomeOutlinedIcon from '@material-ui/icons/HomeOutlined';
import EditIcon from '@material-ui/icons/Edit';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import {PrevOrders} from '../data/OrderData';

const useStyles = makeStyles((theme) => ({
  root: {
    height: '100vh',
  },
  plate:{
    padding:theme.spacing(1),
  },
  typo: {
    padding:theme.spacing(1),
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

export default function PreviousOrders() {
  const classes = useStyles();
  const [open, setOpen] = React.useState(false);

  const handleClickOpen = () => {
    setOpen(true);
    console.log(PrevOrders);
  };

  const handleClose = () => {
    setOpen(false);
  };

  function createData(item, quantity, price) {
  return { item, quantity, price };
}

const rows = [
  createData('Frozen yoghurt', 6.0,159),
  createData('Ice cream sandwich', 9.0, 237),
  createData('Eclair', 16.0, 262),
  createData('Cupcake', 3.7, 305),
  createData('Gingerbread', 25, 356 ),
  createData('Delivery Charges', '', 25 ),
  createData('Total', '', 401 ),
];

  return (
    <Grid container >
    {PrevOrders.map((order) => (
      <Grid xs={12} md={6} className={classes.plate}>
        <Card >
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            {order.name}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Order # {order.no}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Delivery time: {order.deliveryTime}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}> 
            Total Price: {order.totalPrice}
          </Typography>
        </CardContent>
      <CardActions>
        <Button size="small" color="primary" variant="contained" onClick={handleClickOpen}>
          View Details
        </Button>
        <Button size="small" color="secondary" variant="contained">
          Reorder
        </Button>
      </CardActions>
    </Card>
    <Dialog
        open={open}
        onClose={handleClose}
        aria-labelledby="alert-dialog-title"
        aria-describedby="alert-dialog-description"
      >
        <DialogTitle id="alert-dialog-title">{"Order Details"}</DialogTitle>
        <DialogContent>
          <DialogContentText id="alert-dialog-description">

          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Order # {order.no}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Restaurant Name: {order.name}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Order Time: 11:30 am 22-03-2020
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Delivery Time:{order.deliveryTime}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p" className={classes.typo}>
            Delivered By: Mohan Ranga
          </Typography>


        <TableContainer >
      <Table className={classes.table} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>Items</TableCell>
            <TableCell align="right">Quantity</TableCell>
            <TableCell align="right">Price</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow key={row.name}>
              <TableCell component="th" scope="row">
                {row.item}
              </TableCell>
              <TableCell align="right">{row.quantity}</TableCell>
              <TableCell align="right">{row.price}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>

          </DialogContentText>
        </DialogContent>
      </Dialog>
      </Grid>))}
    </Grid>
  );
}